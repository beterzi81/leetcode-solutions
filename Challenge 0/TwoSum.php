<?php
class LongestSubstringWithoutRepeatingCharacters {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
    function twoSum($nums, $target) {
        for($i=0;$i<count($nums);$i++){
            $diff = $target-$nums[$i];
            for($j=$i+1;$j<count($nums);$j++){
                if($nums[$j] == $diff){
                    return [$i,$j];
                }
            }
        }
    }
}