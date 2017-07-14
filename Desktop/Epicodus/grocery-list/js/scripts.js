$(document).ready(function() {
  $("#grocery-store").submit(function() {
    event.preventDefault();
    var items = ["item1", "item2" ,"item3", "item4", "item5"];
      var itemVals = items.map(function(item) {
        return $("#" + item).val().toUpperCase();
      });
      alert(itemVals);
      itemVals.sort();
      itemVals.forEach(function(itemVal) {
        $(".gls").append("<li>" + itemVal + "</li>");
      });
      $("#grocery-list").show();
      $("#grocery-list").hide();

  });
});
