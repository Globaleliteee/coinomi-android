package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class GamecreditsMain extends BitFamily {
    private GamecreditsMain() {
        id = "gamecredits.main";

        addressHeader = 38;
        p2shHeader = 62;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 176;

        name = "Gamecredits";
        symbol = "Game";
        uriScheme = "gamecredits";
        bip44Index = 101;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 GAME mininput
        softDustLimit = value(100000); // 0.001 GAME
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Gamecredits Signed Message:\n");
    }

    private static GamecreditsMain instance = new GamecreditsMain();
    public static synchronized CoinType get() {
        return instance;
    }
}