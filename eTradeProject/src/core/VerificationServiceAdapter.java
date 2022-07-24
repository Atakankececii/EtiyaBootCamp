package core;

import verificationEmail.VerificationEmailManager;

public class VerificationServiceAdapter implements VerificationService {
    @Override
    public boolean verification(String email) {
        VerificationEmailManager verificationEmailManager = new VerificationEmailManager();
        verificationEmailManager.verificationEmail(email);
        return true;

    }
}
