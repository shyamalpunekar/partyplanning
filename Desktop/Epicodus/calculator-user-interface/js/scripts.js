var add = function(number1, number2) {
  return number1 + number2;
};


// var number1 = parseInt($("#add1").val());
// var number2 = parseInt($("#add2").val());
// alert(add(number1, number2));
//
// alert(number1);
// alert(number2);
// add("#add1", "add2");

$(document).ready(function() {
  $("#add").submit(function(event) {
    alert("hi");
    event.preventDefault();
    var number1 = parseInt($("#add1").val());
    var number2 = parseInt($("#add2").val());

    alert(add(number1, number2));
  });
});
