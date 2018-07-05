package com.example.demo.family;

public class Father extends Component {
    @Override
    public void setSex(String sex) {
        System.out.println("Can not set this variable.");
    }

    @Override
    public String getSex() {
        return null;
    }
}
