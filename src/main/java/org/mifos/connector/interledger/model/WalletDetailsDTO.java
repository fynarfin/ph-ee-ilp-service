package org.mifos.connector.interledger.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WalletDetailsDTO {

    private String id;
    private String publicName;
    private String assetCode;
    private int assetScale;
    private String authServer;
    private String resourceServer;
}
