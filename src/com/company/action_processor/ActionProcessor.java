package com.company.action_processor;

public interface ActionProcessor {

    public boolean validate(String input);

    public void execute(String input);

}
