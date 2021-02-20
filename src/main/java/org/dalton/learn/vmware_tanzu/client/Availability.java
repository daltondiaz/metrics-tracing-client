package org.dalton.learn.vmware_tanzu.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Availability {
    private boolean available;
    private String console;
}
