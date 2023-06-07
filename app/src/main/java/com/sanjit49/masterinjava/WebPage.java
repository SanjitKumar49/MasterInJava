package com.sanjit49.masterinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebPage extends AppCompatActivity {
    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);
         webView = findViewById(R.id.webView);
        String str = getIntent().getStringExtra("question");


        webView.setWebViewClient(new WebViewClient());

        switch (str) {
            case "Arr1":
                this.setTitle("Maximum and Minimum Element in an Array");
                webView.loadUrl("https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/");
                break;
            case "Arr2":
                this.setTitle("Reverse the Array");
                webView.loadUrl("https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/");
                break;
            case "Arr3":
                this.setTitle("Maximum-Subarray");
                webView.loadUrl("https://www.geeksforgeeks.org/print-the-maximum-subarray-sum/");
                break;
            case "Arr4":
                this.setTitle("Contains Duplicate");
                webView.loadUrl("https://www.geeksforgeeks.org/check-given-array-contains-duplicate-elements-within-k-distance/");
                break;
            case "Arr5":
                this.setTitle("Chocolate Distribution Problem");
                webView.loadUrl("https://www.geeksforgeeks.org/chocolate-distribution-problem/");
                break;
            case "Arr6":
                this.setTitle("Search in Rotated Sorted Array");
                webView.loadUrl("https://www.geeksforgeeks.org/?p=1068");
                break;
            // Medium Question of Array //
            case "Arr8":
                this.setTitle("Next Permutation");
                webView.loadUrl("https://www.geeksforgeeks.org/next-permutation/");
                break;
            case "Arr9":
                this.setTitle("Best time to Buy and Sell Stock");
                webView.loadUrl("https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/");
                break;
            case "Arr10":
                this.setTitle("Repeat and Missing Number Array");
                webView.loadUrl("https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/");
                break;
            case "Arr11":
                this.setTitle("Kth-Largest Element in an Array");
                webView.loadUrl("https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/");
                break;
            case "Arr12":
                this.setTitle("Trapping Rain Water");
                webView.loadUrl("https://www.geeksforgeeks.org/trapping-rain-water/");
                break;
            case "Arr13":
                this.setTitle("Product of Array Except Self");
                webView.loadUrl("https://www.geeksforgeeks.org/a-product-array-puzzle/");
                break;
            case "Arr14":
                this.setTitle("Maximum Product Subarray");
                webView.loadUrl("https://www.geeksforgeeks.org/maximum-product-subarray/");
                break;
            case "Arr15":
                this.setTitle("Find Minimum in Rotated Sorted Array");
                webView.loadUrl("https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/");
                break;
            case "Arr16":
                this.setTitle("Find if there is a pair with a given sum in the rotated sorted Array");
                webView.loadUrl("https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/?ref=lbp");
                break;
            case "Arr17":
                this.setTitle("Find a triplet that sum to a given value");
                webView.loadUrl("https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/");
                break;
            case "Arr18":
                this.setTitle("Container With Most Water");
                webView.loadUrl("https://www.bing.com/search?q=Container+With+Most+Water&qs=n&form=QBRE&sp=-1&lq=0&pq=container+with+most+water&sc=10-25&sk=&cvid=CAC9347583704B35A785BFC2D5748B21&ghsh=0&ghacc=0&ghpl=");
                break;
            case "Arr19":
                this.setTitle("Find if there is a pair with a given sum in the rotated sorted Array");
                webView.loadUrl("https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/");
                break;
            case "Arr20":
                this.setTitle("Kth smallest element");
                webView.loadUrl("https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1");
                break;
            case "Arr21":
                this.setTitle("Merge Overlapping Intervals");
                webView.loadUrl("https://www.geeksforgeeks.org/merging-intervals/");
                break;
            case "Arr22":
                this.setTitle("Find minimum number of merge operations to make an array palindrome");
                webView.loadUrl("https://www.geeksforgeeks.org/find-minimum-number-of-merge-operations-to-make-an-array-palindrome/");
                break;
            case "Arr23":
                this.setTitle("Arrange given numbers to form the biggest number");
                webView.loadUrl("https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/");
                break;
            case "Arr24":
                this.setTitle("Space optimization using bit manipulations");
                webView.loadUrl("https://www.geeksforgeeks.org/space-optimization-using-bit-manipulations/");
                break;


            // Hard Question of Array //
            case "Arr26":
                this.setTitle("Subarray Sum Divisible K");
                webView.loadUrl("https://www.geeksforgeeks.org/longest-subarray-sum-divisible-k/");
                break;
            case "Arr27":
                this.setTitle("Print all Possible Combinations of r Elements in a Given Array of Size n");
                webView.loadUrl("https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/");
                break;
            case "Arr28":
                this.setTitle("Mo's Algorithm");
                webView.loadUrl("https://www.geeksforgeeks.org/mos-algorithm-query-square-root-decomposition-set-1-introduction/");
                break;
        }



        // String Question Start

        switch (str) {
            case "Str1":
                this.setTitle("Valid Palindrome");
                webView.loadUrl("https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/");
                break;
            case "Str2":
                this.setTitle("Valid Anagram");
                webView.loadUrl("https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/");
                break;
            case "Str3":
                this.setTitle("Valid parentheses");
                webView.loadUrl("https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/");
                break;
            case "Str4":
                this.setTitle("Remove Consecutive Characters");
                webView.loadUrl("https://practice.geeksforgeeks.org/problems/consecutive-elements2306/1");
                break;
            case "Str5":
                this.setTitle("Longest Common Prefix");
                webView.loadUrl("https://www.geeksforgeeks.org/longest-common-prefix-using-sorting/");
                break;
            case "Str6":
                this.setTitle("Convert a Sentence into its Equivalent Mobile Numeric Keypad Sequence");
                webView.loadUrl("https://www.geeksforgeeks.org/convert-sentence-equivalent-mobile-numeric-keypad-sequence/");
                break;
            case "Str7":
                this.setTitle("Print all the Duplicates in the Input String");
                webView.loadUrl("https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/");
                break;
            // Medium Question of String //
            case "Str9":
                this.setTitle("Longest Substring without Repeating Characters");
                webView.loadUrl("https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/");
                break;
            case "Str10":
                this.setTitle("Longest Repeating Character Replacement");
                webView.loadUrl("https://practice.geeksforgeeks.org/problems/longest-repeating-character-replacement/1");
                break;
            case "Str11":
                this.setTitle("Group Anagrams from given list");
                webView.loadUrl("https://www.geeksforgeeks.org/python-group-anagrams-from-given-list/");
                break;
            case "Str12":
                this.setTitle("Length of Longest Palindrome Substring");
                webView.loadUrl("https://www.geeksforgeeks.org/length-of-longest-palindrome-substring/");
                break;

            case "Str13":
                this.setTitle("Count All Palindrome Sub-Strings in a String");
                webView.loadUrl("https://www.geeksforgeeks.org/count-palindrome-sub-strings-string/");
                break;
            case "Str14":
                this.setTitle("Next Permutation");
                webView.loadUrl("https://www.geeksforgeeks.org/next-permutation/");
                break;
            case "Str15":
                this.setTitle("Count All Palindromic Subsequence in a given String");
                webView.loadUrl("https://www.geeksforgeeks.org/count-palindromic-subsequence-given-string/");
                break;
            case "Str16":
                this.setTitle("Smallest window in a String containing all characters of other String");
                webView.loadUrl("https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/");
                break;
            case "Str17":
                this.setTitle("Wildcard Pattern Matching");
                webView.loadUrl("https://www.geeksforgeeks.org/wildcard-pattern-matching/");
                break;
            case "Str18":
                this.setTitle("Longest prefix which is also suffix");
                webView.loadUrl("https://www.geeksforgeeks.org/longest-prefix-also-suffix/");
                break;
            case "Str19":
                this.setTitle("Rabin-Karp Algorithm for Pattern Searching");
                webView.loadUrl("https://www.geeksforgeeks.org/rabin-karp-algorithm-for-pattern-searching/");
                break;
            case "Str20":
                this.setTitle("Transform One String to Another using Minimum Number of Given Operation");
                webView.loadUrl("https://www.geeksforgeeks.org/transform-one-string-to-another-using-minimum-number-of-given-operation/");
                break;

            // Hard Question of String //
            case "Str22":
                this.setTitle("Minimum Window Substring");
                webView.loadUrl("https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/");
                break;
            case "Str23":
                this.setTitle("Boyer Moore Algorithm for Pattern Searching");
                webView.loadUrl("https://www.geeksforgeeks.org/boyer-moore-algorithm-for-pattern-searching/");
                break;
            case "Str24":
                this.setTitle("Word Wrap");
                webView.loadUrl("https://practice.geeksforgeeks.org/problems/word-wrap1646/1");
                break;
        }


        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed(){
        if(webView.canGoBack()) {
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}