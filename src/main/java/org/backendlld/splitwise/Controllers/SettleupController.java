package org.backendlld.splitwise.Controllers;

import org.backendlld.splitwise.Models.Group;
import org.backendlld.splitwise.Services.SettleupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SettleupController {

    @Autowired
    private SettleupService settleupService;
    private void SettleUpGroup(Group group) {
        settleupService.SettleUpGroup(group);
    }
}
