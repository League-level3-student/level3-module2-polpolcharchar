/*
 * Copy the code below into a new Processing sketch.
 */

// 1. Create an array of ints. Don't initialize it yet.
int ints[];

void setup() {
  // 2. Set the size of your window to at least 500 width 500 height
  size(1000, 800);

  // 3. Initialize your array to 50
  ints = new int[500];
  
  // 4. Initialize the ints in the array with random numbers
  //    from 0 to the built-in height variable, (int)random(height)
  randomize(ints);

  // 5. Call the noStroke() method to remove the outline for each shape
  noStroke();
}

void draw() {
  // 6. Set the background color with background(r, g, b);
  background(15,15,15);

  // 7. Set the color for your graph using the fill() method
  fill(200, 15, 15);

  // 8. Draw a rectangle for each int in your array.
  //    the x value will be the loop variable multipled by (width/intArray.length)
  //    the y value will the height variable
  //    the width is (width/intArray.length)
  //    the height is the negative array value at the array index, e.g. -intArray[ i ]
  for(int i = 0; i < ints.length; i++){
    rect(i * (width/ints.length), height, width/ints.length, -ints[i]);
  }


  // 9. Call the stepSort method
  stepSort(ints);

  // 10. Extract the code from step 4 that randomizes the array into a new method.
  

  // 11. Call the method you made in step 10 when the mouse is pressed using the mousePressed variable
  if(mousePressed){
    randomize(ints);
  }
}

int startIndex = 1;

void stepSort(int[] arr) {
  for (int i = startIndex; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;

      startIndex = i;
      return;
    }
  }
  startIndex = 1;
}

void randomize(int[] arr){
  for(int i = 0; i < arr.length; i++){
    arr[i] = (int)random(height);
  }
}
