package com.company.Sodoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(SodokuGame game) throws  IOException;
    SodokuGame getGameData() throws IOException;
}
