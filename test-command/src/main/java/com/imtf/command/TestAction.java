package com.imtf.command;

import com.imtf.api.TestService;
import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;

@Service
@Command(scope = "test", name = "test-action")
public class TestAction implements Action {

    @Reference
    TestService testService;

    public Object execute() {
        System.out.println("Now --> " + testService.getDate());
        return null;
    }
}
