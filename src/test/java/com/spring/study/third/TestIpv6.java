package com.spring.study.third;

import inet.ipaddr.IPAddress;
import inet.ipaddr.IPAddressSegment;
import inet.ipaddr.IPAddressString;
import org.apache.commons.validator.routines.InetAddressValidator;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021/11/10 14:08
 */
public class TestIpv6 {
    public static void main(String[] args) {
        String ipv6Str = "5001::1";
//        String ipv6Str = "5001::1/20";
//        String ipv6Str = "2001:db8:abcd:0012::/64";
        IPAddressString addrString = new IPAddressString(ipv6Str);
        IPAddress addr = addrString.getAddress();
        IPAddress.IPVersion version = addrString.getIPVersion();

        int bitLength = addr.getBitCount();
        Integer prefixLen = addr.getNetworkPrefixLength();

        IPAddress mask = addr.getNetworkMask();

        // three different ways to get the network address
        IPAddress networkAddr = addr.mask(mask);
        IPAddress networkAddrAnotherWay = addr.getLower().withoutPrefixLength();
        IPAddress networkAddrOneMoreWay = addr.toZeroHost().withoutPrefixLength();

        PrintStream out = System.out;
        out.println(version + " address: " + addr);
        out.println("network address: " + networkAddr);
        out.println("prefix length: " + prefixLen);
        out.println("bit length: " + bitLength);

        System.out.println("-----------------------------------");
        System.out.println(networkAddr.toNormalizedString());
        System.out.println(networkAddr.toCanonicalString());
        System.out.println(addr);
        System.out.println("-----------------------------------");

        System.out.println(InetAddressValidator.getInstance().isValidInet6Address(networkAddr.toNormalizedString()));
        System.out.println(InetAddressValidator.getInstance().isValidInet6Address(networkAddr.toCanonicalString()));

//        String ipv6 = "2001::1/20";
//        String ipv6 = "2001::1";
//        String ipv6 = networkAddr.to;
//        String ipv6 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
//        String ipv6 = "FF01::1101";
//        String ipv6 = "::1";
//        String ipv6 = "2001:0DB8:0000:0023:0008:0800:200C:417A";
//        String ipv6 = "2001:DB8:0:23:8:800:200C:417A";

//        String normalizedString = new IPAddressString(ipv6).getAddress().toNormalizedString();
//        String canonicalString = new IPAddressString(ipv6).getAddress().toCanonicalString();
//
//        System.out.println(normalizedString);
//        System.out.println(InetAddressValidator.getInstance().isValidInet6Address(normalizedString));
//
//        System.out.println();
//
//        System.out.println(canonicalString);
//        System.out.println(InetAddressValidator.getInstance().isValidInet6Address(canonicalString));
    }
}
