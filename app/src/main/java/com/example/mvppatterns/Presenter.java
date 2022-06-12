package com.example.mvppatterns;

public class Presenter  implements Contract.Presenterclass {
    Contract.view view1;

    public Presenter(Contract.view view1) {
        this.view1 = view1;
    }

    @Override
    public void onLogin(String name, String password) {
        if (name.equals("Siril") && password.equals("siril@123")) {
            view1.onSuccess("Succesfull");
        } else {
            view1.onError("failed");
        }
    }
}