package com.abdulazis.testsqa;

import com.abdulazis.testsqa.pages.Palindrome;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPalindromeSatu {
    Palindrome palindrome = new Palindrome();

    @Test
    void testPalindrome(){
        Assert.assertTrue(palindrome.isPalindrome("a"));
        Assert.assertTrue(palindrome.isPalindrome("aba"));
        Assert.assertTrue(palindrome.isPalindrome("kodok"));
        System.out.println("kata-kata di atas adalah palindrome");
        System.out.println("");
        Assert.assertFalse(palindrome.isPalindrome("ab"));
        Assert.assertFalse(palindrome.isPalindrome("abab"));
        Assert.assertFalse(palindrome.isPalindrome("kodcok"));
        Assert.assertFalse(palindrome.isPalindrome("azis"));
        System.out.println("kata-kata di atas bukan Palindrome");
    }
}

//Test menggunakan page object
