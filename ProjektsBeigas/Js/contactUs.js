var map = "";
$(function () {
    function myMap() {

        var mapLocation = {
            center: new google.maps.LatLng(56.954995, 24.099614),
            zoom: 15,
        };
        // var markerImage = 'C:\Users\Kristaps\HTML\Projekts\pictures\mapMarker.png';
        
        map = new google.maps.Map(document.getElementById("googleMap"), mapLocation);
 
        var marker = new google.maps.Marker({
            position: new google.maps.LatLng(56.954995, 24.099614),
            map: map,
            // icon: markerImage,
            title: 'We are here!'
          });

          var contentString = '<div class="info-window">' +
            '<h3>We are here</h3>' +
            '<div class="info-content">' +
            '<p>Kitty kitty</p>' +
            '</div>' +
            '</div>';

        var infowindow = new google.maps.InfoWindow({
            content: contentString,
            maxWidth: 400
        });

        marker.addListener('click', function () {
            infowindow.open(map, marker);
        });
    }


    google.maps.event.addDomListener(window, 'load', myMap);
});