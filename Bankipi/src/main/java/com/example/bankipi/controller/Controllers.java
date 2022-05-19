{

    @Autowired
    BankService bankService;


    @GetMapping("/getBalance/{id}")
    public String getBalance(@PathVariable int id) {
        try {
            return bankService.getBalance(id) + "";

        }catch (Exception e){
            System.out.println(e.getMessage());

            return "Id не найден " + e;
        }
    }



    @PutMapping("/putMoney")
    public String putMoney(@RequestBody Customers customers){
        int balance = 0;
        try {
         balance =  bankService.getBalance(customers.getId());

        }catch (EntityNotFoundException e){
            return "ID не найден";
        }
        catch (Exception e){
            return "ошибка 0 " +  e;
        }
        int PutMoney = customers.getBalance();
        if (PutMoney<=0){
            return  balance + "ошибка при выполнении операции";
        }
        customers.setBalance(balance+PutMoney);
        bankService.createacc(customers);
        return "Успешно добавлено " + balance;
    }

    @PutMapping("/takeMoney")
    public String takeMoney(@RequestBody Customers customers){
        int balance = 0;
        try {
            balance =  bankService.getBalance(customers.getId());
        }catch (EntityNotFoundException e){
            return "ID не найден";
        }
        catch (Exception e){
            return "ошибка 0" + e;
        }
        int TakeMoney = customers.getBalance();
        if (TakeMoney<=0){
            return  balance + "недостаточно средств";
       }
       customers.setBalance(balance-TakeMoney);
       bankService.createacc(customers);
       return "Успешно отнято " + balance;
   }
}
