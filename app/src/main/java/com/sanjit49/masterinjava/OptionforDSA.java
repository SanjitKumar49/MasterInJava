package com.sanjit49.masterinjava;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;



public class OptionforDSA extends AppCompatActivity {
    String[] number ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionfor_dsa);

        String[] array={"-------> Easy Level Question<-------","Maximum and Minimum Element in an Array","Reverse the Array","Maximum-Subarray","Contains Duplicate","Chocolate Distribution Problem","Search in Rotated Sorted Array","------->Medium Level Question<-------","Next Permutation","Best time to Buy and Sell Stock","Repeat and Missing Number Array","Kth-Largest Element in an Array","Trapping Rain Water","Product of Array Except Self","Maximum Product Subarray","Find Minimum in Rotated Sorted Array","Find Pair with Sum in Sorted & Rotated Array","3Sum","Container With Most Water","Given Sum Pair","Kth - Smallest Element","Merge Overlapping Intervals","Find Minimum Number of Merge Operations to Make an Array Palindrome","Given an Array of Numbers Arrange the Numbers to Form the Biggest Number","Space Optimization Using Bit Manipulations","------->Hard Level Question<-------","Subarray Sum Divisible K","Print all Possible Combinations of r Elements in a Given Array of Size n","Mo's Algorithm"};

        String[] string={"------Easy Level Question------","Valid Palindrome","Valid Anagram","Valid parentheses","Remove Consecutive Characters","Longest Common Prefix","Convert a Sentence into its Equivalent Mobile Numeric Keypad Sequence","Print all the Duplicates in the Input String","------Medium Level Question------","Longest Substring without Repeating Characters","Longest Repeating Character Replacement","Group Anagrams ","Longest Palindromic Substring","Palindromic Substrings","Next Permutation","Count Palindromic Subsequences","Smallest Window in a String Containing all the Characters of Another String","Wildcard String Matching","Longest Prefix Suffix","Rabin-Karp Algorithm for Pattern Searching","Transform One String to Another using Minimum Number of Given Operation","------Hard Level Question------","Minimum Window Substring","Boyer Moore Algorithm for Pattern Searching","Word Wrap"};


        String dsachoice=getIntent().getStringExtra("DSA");
        ListView listView = findViewById(R.id.optionlist);
        switch (dsachoice) {
            case "Array": {
                custombaseadapter custombaseadapter = new custombaseadapter(getApplicationContext(), array, number);
                listView.setAdapter(custombaseadapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String selectedItem = (String) adapterView.getItemAtPosition(i);
                        // Easy Q
                        if (i == 1) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr1");
                            startActivity(intent);
                        } else if (i == 2) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr2");
                            startActivity(intent);
                        } else if (i == 3) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr3");
                            startActivity(intent);
                        } else if (i == 4) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr4");
                            startActivity(intent);
                        } else if (i == 5) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr5");
                            startActivity(intent);
                        } else if (i == 6) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr6");
                            startActivity(intent);
                        }

                        // medium question //
                        else if (i == 8) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr8");
                            startActivity(intent);
                        } else if (i == 9) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr9");
                            startActivity(intent);
                        } else if (i == 10) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr10");
                            startActivity(intent);
                        } else if (i == 11) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr11");
                            startActivity(intent);
                        } else if (i == 12) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr12");
                            startActivity(intent);
                        } else if (i == 13) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr13");
                            startActivity(intent);
                        } else if (i == 14) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr14");
                            startActivity(intent);
                        } else if (i == 15) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr15");
                            startActivity(intent);
                        } else if (i == 16) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr16");
                            startActivity(intent);
                        } else if (i == 17) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr17");
                            startActivity(intent);
                        } else if (i == 18) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr18");
                            startActivity(intent);
                        } else if (i == 19) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr19");
                            startActivity(intent);
                        } else if (i == 20) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr20");
                            startActivity(intent);
                        } else if (i == 21) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr21");
                            startActivity(intent);
                        } else if (i == 22) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr22");
                            startActivity(intent);
                        } else if (i == 23) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr23");
                            startActivity(intent);
                        } else if (i == 24) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr24");
                            startActivity(intent);
                        }
                        //hard question
                        if (i == 26) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr26");
                            startActivity(intent);
                        } else if (i == 27) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr27");
                            startActivity(intent);
                        } else if (i == 28) {
                            Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                            intent.putExtra("question", "Arr28");
                            startActivity(intent);
                        }
                    }
                });
                break;
            }
            case "String": {
                custombaseadapter custombaseadapter = new custombaseadapter(getApplicationContext(), string, number);
                listView.setAdapter(custombaseadapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String selectedItem = (String) adapterView.getItemAtPosition(i);
                        // Easy Q
                        switch (i) {
                            case 1: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str1");
                                startActivity(intent);
                                break;
                            }
                            case 2: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str2");
                                startActivity(intent);
                                break;
                            }
                            case 3: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str3");
                                startActivity(intent);
                                break;
                            }
                            case 4: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str4");
                                startActivity(intent);
                                break;
                            }
                            case 5: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str5");
                                startActivity(intent);
                                break;
                            }
                            case 6: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str6");
                                startActivity(intent);
                                break;
                            }
                            case 7: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str7");
                                startActivity(intent);
                                break;
                            }
                            // Medium Level Question
                            case 9: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str9");
                                startActivity(intent);
                                break;
                            }
                            case 10: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str10");
                                startActivity(intent);
                                break;
                            }
                            case 11: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str11");
                                startActivity(intent);
                                break;
                            }
                            case 12: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str12");
                                startActivity(intent);
                                break;
                            }
                            case 13: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str13");
                                startActivity(intent);
                                break;
                            }
                            case 14: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str14");
                                startActivity(intent);
                                break;
                            }
                            case 15: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str15");
                                startActivity(intent);
                                break;
                            }
                            case 16: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str16");
                                startActivity(intent);
                                break;
                            }
                            case 17: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str17");
                                startActivity(intent);
                                break;
                            }
                            case 18: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str18");
                                startActivity(intent);
                                break;
                            }
                            case 19: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str19");
                                startActivity(intent);
                                break;
                            }
                            case 20: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str20");
                                startActivity(intent);
                                break;
                            }

                            // Hard Level Question
                            case 22: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str22");
                                startActivity(intent);
                                break;
                            }
                            case 23: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str23");
                                startActivity(intent);
                                break;
                            }
                            case 24: {
                                Intent intent = new Intent(OptionforDSA.this, WebPage.class);
                                intent.putExtra("question", "Str24");
                                startActivity(intent);
                                break;
                            }
                        }
                    }
                });
                break;
            }
        }

        }


    }
