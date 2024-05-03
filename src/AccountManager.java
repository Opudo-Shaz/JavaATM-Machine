import java.util.Arrays;
import java.util.List;

class AccountManager{
    //create a list of accounts;
    public List<Account> accounts=getAccounts();

    public List<Account> getAccounts(){
        //list of accounts from database
        return Arrays.asList(new Account("Nesh","nesh1",10000),
                new Account("Immoh1","immoh",1000),
                new Account("Jeck3","jeck3",900));
    }
    public Account selectAccount(String accountName,String accountPassword){
        System.out.print(accounts);
        for (Account account:accounts){
            if(account.isMatching(accountName, accountPassword)){
                System.out.print("Matched, Welcome "+accountName+"Your balance is "+account.balance);

               return account;
            }
        }
        System.out.print("Not Matched");
        return null;
    }
}