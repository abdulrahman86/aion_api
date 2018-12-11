package org.aion.api.test;

import org.aion.api.IUtils;
import org.aion.api.impl.internal.ApiUtils;
import org.aion.api.sol.impl.DynamicBytes;
import org.aion.api.sol.impl.Uint;
import org.junit.Test;

/** Created by Jay Tseng on 15/12/16. */
public class MiscTests {

    @Test
    public void SolTypeTests() {
        System.out.println(IUtils.bytes2Hex(ApiUtils.toTwosComplement(-2)));

        Uint a = Uint.copyFrom(1);

        String s = a.formatToString(ApiUtils.hex2Bytes("0ffffffe"));
        System.out.println(s);

        DynamicBytes bytes = DynamicBytes.copyFrom(ApiUtils.hex2Bytes("01"));
        assert bytes != null;
        System.out.println(bytes.isType("bytes32"));
        System.out.println(bytes.isType("bytes8"));
        System.out.println(bytes.isType("bytes16"));
        System.out.println(bytes.isType("bytes128"));
        System.out.println(bytes.isType("bytes"));
    }
}
