package com.example.mvppatterns;

public interface Contract {

    interface view{
        void onSuccess(String Message);
        void onError(String Message);
    }
    interface  Presenterclass{
        void onLogin(String name,String password);
    }
}
