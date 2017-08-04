$(document).ready(function() {
  var beverageTaste = function(beverage) {
    return beverage;
  }

  $("#formOne").submit(function(event) {
    event.preventDefault();
    var beverage = $("#beverage").val();
    alert(" Your favorite beverage is " + beverage);
    var flavor = $("input:radio[name=flavor]:checked").val();
        alert(flavor);
  });
});
