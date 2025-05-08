var merge = function(intervals) {
   intervals = intervals.sort((a,b)=> a[0]- b[0]);
   //
   const outputArr = [intervals[0]]; //[[1,3]]
   let prevArr = intervals[0];
   let currArr = null;
    //
    for(var i  = 1; i <= intervals.length -1; i++){
        //check for an overlap/merge
        currArr = intervals[i];
        if(currArr[0] <= prevArr[1]){
            outputArr[outputArr.length-1][1] = Math.max(currArr[1], prevArr[1]);
        }else{
            outputArr.push(currArr);
            prevArr = currArr;
        }
    }
    return outputArr;
}; 
