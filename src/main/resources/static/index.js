var mymap = L.map('mapid').setView([51.505, -0.09], 13);
L.tileLayer('https://api.mapbox.com/styles/v1/{id}/tiles/{z}/{x}/{y}?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpejY4NXVycTA2emYycXBndHRqcmZ3N3gifQ.rJcFIG214AriISLbB6B5aw', {
		maxZoom: 18,
		attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors, ' +
			'Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
		id: 'mapbox/streets-v11',
		tileSize: 512,
		zoomOffset: -1
	}).addTo(mymap);

fetch("http://localhost:8080/paugps").then(function(data) {
	data.json().then(result => {
		console.log(result);
		var tabPauCord =[]
		for (let i = 0; i < result.length; i++){
			if (result[i].latitude !== null && result[i].latitude !== null){
				tabPauCord.push(L.marker([parseFloat(result[i].latitude), parseFloat(result[i].longitude)]));	
			}
		}
		L.layerGroup(tabPauCord).addTo(mymap);
	})}).catch(function(error) {
		console.log(error);
});


fetch("http://localhost:8080/roadposgps").then(function(data) {
	data.json().then(result => {
		var roadMarkers =[]
		var LatLngsMarkers = Array();
		//var LatLngsRoad = Array();
		//console.log(result.length);
		//console.log(result[0].getLatLng());
		for (let i = 0; i < result.length; i++){
			roadMarkers.push(L.marker([result[i].lat, result[i].lon]));
			LatLngsMarkers.push(roadMarkers[i].getLatLng());
		}
		var polyline = L.polyline(LatLngsMarkers, {color: 'red'}).addTo(mymap);
		mymap.fitBounds(polyline.getBounds());
	})
	
}).catch(function(error) {
	console.log(error);
});