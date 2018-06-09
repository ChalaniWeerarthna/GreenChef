function showLoginForm() {

    var LoginForm = document.getElementById("loginForm");
    var SignUpForm = document.getElementById("signUpForm");
    var i=0;
    var id =  setInterval(slowDown,20);


    function slowDown() {

        if(i==9){

            clearInterval(id);
        }
        else{
            LoginForm.style.opacity = i / 10;
            loginForm.style.top = loginForm.style.top+8*i+"%"
            i=i+1;
        }

    }

}

function showSignUpForm() {

    var LoginForm = document.getElementById("loginForm");
    var SignUpForm = document.getElementById("signUpForm");

}