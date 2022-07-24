package core;

import googleAccount.GoogleAccountManager;

public class GoogleServiceAdapter implements GoogleAccountService{
    @Override
    public boolean googleLogin(String email) {

      GoogleAccountManager googleAccountManager = new GoogleAccountManager();
      googleAccountManager.login(email);
      return true;
    }
}
