$(document).ready(function() {

var add = function(firstValue, secondValue){
  return firstValue * secondValue;

};

  var str = 'Twas the night before Xmas...';
  var newstr = str.replace(/xmas/i, 'Christmas');
  alert(newstr);

  $("#formTracker").submit(function(event) {
    event.preventDefault();
    var firstValue = parseInt($("#firstValue").val());
    var secondValue = parseInt($("#secondValue").val());
    var result = add(firstValue, secondValue);
    $(".firstValue").append(result);
    $("#output").show();
  });

});
