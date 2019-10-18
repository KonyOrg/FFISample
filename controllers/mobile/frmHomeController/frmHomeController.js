define({ 

  //Type your controller code here 
  showToastMessageUsingFFI : function () {
    kony.print("*** Entering into showToastMessageUsingFFI ***");
    //Invokes function 'showToastMessage'
    com.training.showToastMessage("Hello World!", 5);
    kony.print("*** Exiting out of showToastMessageUsingFFI ***");
  },

  concatenateStringsUsingFFI : function () {
    kony.print("*** Entering into concatenateStringsUsingFFI ***");
    //Creates an object of class 'Concatenation'
    var ConcatenationObject = new com.training.Concatenation();
    //Invokes method 'concatStrings' on the object
    var returnedValue = ConcatenationObject.concatStrings("Hello", "World");
    alert("*** returnedValue: "+returnedValue);
    kony.print("*** Exiting out of concatenateStringsUsingFFI ***");
  }

});