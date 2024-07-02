package codeChallenge.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Interview
{

//    Given an unsorted integer array, find a triplet with a given sum in it.
//        Input:
//    nums = [ 2, 7, 4, 0, 9, 5, 1, 3 ]
//    target = 6
//    Output: The triplets with the given sum 6 are {0, 1, 5}, {0, 2, 4}, {1, 2, 3}

        public static ArrayList<ArrayList<Integer>> findTriplets(int[] nums, int target) {
            Arrays.sort(nums); // Sort the array
            ArrayList<ArrayList<Integer>> triplets = new ArrayList<>();

            for (int i = 0; i < nums.length - 2; i++) {
                // Skip duplicate elements
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }

                int l = i + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum == target) {
                        triplets.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                        l++;
                        r--;
                        // Skip duplicate elements
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
            return triplets;
        }

        public static void main(String[] args) {
            int[] nums = {2, 7, 4, 0, 9, 5, 1, 3};
            int target = 6;
            ArrayList<ArrayList<Integer>> output = findTriplets(nums, target);
            System.out.println("The triplets with the given sum " + target + " are " + output.toString());
        }
    }



//    Open the web application in the browser and click on the button.
//    Once the button is clicked it will open a separate browser window.
//    Navigate to that browser window where you will find a drop down where the item is present - “name2 is3 My1 Andrei4”.
//    Select that item and then write a program to get the below output
//    My name is Andrei


//    Write a piece of code which will perform POST API call with OAuth1 authentication,
//    perform serialization and deserialization and assert the JSON Response object for its JsonObjects and JsonArray

//    public static void main(String[] args)
//    {
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://google.com");
//        driver.findElement(By.id("search")).click();
//
//
//        driver.switchTo().window();
//        driver.findElement(By.id("dropDown")).click();
//        driver.findElement(By.id("name2 is3 My1 Andrei4")).click();       ;
//
//        System.out.println( driver.findElement(By.id("name2 is3 My1 Andrei4")).getText());
//
//
//
//
//    }
//}
