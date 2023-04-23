private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    //get user inputs
    String email = emailTxtF.getText();
    

    //check if any fields are empty
    if(email.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || confirmPassword.isEmpty() || phoneNumber.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields");
    }
    //check if password and confirm password fields match
    else if(!password.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(this, "Passwords do not match");
    }
    //perform other validations as needed, e.g. email format, password strength, etc.
    else if(!isValidEmail(email)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid email address");
    }
    else if(!isValidPassword(password)) {
        JOptionPane.showMessageDialog(this, "Please enter a password with at least 8 characters and one uppercase letter");
    }
    else if(!isValidPhoneNumber(phoneNumber)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid phone number");
    }

    else {
        //assuming successful registration, store the user details in the database
        //then send a verification email or SMS to the user's phone number
        String firstNameFromDB = "My";
        String lastNameFromDB = "Name";
        String dobFromDB = "01-01-2002";
        String emailFromDB = "abcd@gmail.com";
        String passwordFromDB = "12345678";
        String phoneNumberFromDB = "01712345678";
        
        if(email.equals(emailFromDB) && password.equals(passwordFromDB)) {
            //if the user is registered successfully, send a verification email or SMS to their phone number
            String otp = generateOTP();
            //send verification email
            //SendMail.sendMail(email, "Verification Code", "Your verification code is: " + otp);
            //or send verification SMS
            //SMS.sendSMS(phoneNumber, "Your verification code is: " + otp);
            //then show the verification window to the user to enter the code
            dispose();
            new VerifyAccount(otp);
        }
        else {
            JOptionPane.showMessageDialog(this, "Incorrect email or password");
        }
    }
}

//function to check if email address is valid
private boolean isValidEmail(String email) {
    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
}

//function to check if password is valid
private boolean isValidPassword(String password) {
    String regex = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(password);
    return matcher.matches();
}

//function to check if phone number is valid
private boolean isValidPhoneNumber(String phoneNumber) {
    String regex = "^[0-9]{11}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(phoneNumber);
    return matcher.matches();
}

//function to generate a random 4-digit OTP
private String generateOTP() {
    Random random = new Random();
    int otp = 1000 + random.nextInt(9000);
    return String.valueOf(otp);
}
