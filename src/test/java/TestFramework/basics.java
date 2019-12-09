package TestFramework;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class basics {

	@Test
public void getPlaceAPI()
{
	
		//BaseURL or Host
		//GET Request--GoogleMaps
		
		RestAssured.baseURI="https://maps.googleapis.com";
		
		given().
		       param("location","-33.8670522,151.1957362").
		       param("radius","500").
		       param("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
		      
		       
		 when().
		       get("/maps/api/place/nearbysearch/json").
		       
		 then().
		 
		       assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		       body("results[0].name",equalTo("Sydney")).and().
		       body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
		     //  body("results[0].geometry.location.lng", equalTo("151.20929")).and().
		       
		       
		     //  header("Server","pablo");
		      header("Server","scaffolding on HTTPServer2");
		        
		       /*header("dfd","fsdfds").
		       cookie("dsfs","csder").
		       body()*/
		//Status code of the response
		//Content type 
		//Body
		//Header responses
	
}

}


//***********************************
// JSON RESPONSE
//***************************************************

/*
 * { "html_attributions": [], "next_page_token":
 * "CoQE_AEAAOTrs0rLUdcza2fWG_g0JYp4oAvyizNcwgdRa0IUpI-OUMlhS4oMfriJrhMBZM9B7rHKpHSlfKv8AFeE5tBUK5fd6Qkp-G0P3WWabin5f6lRa5KGzg-by2MfFIVPymrxwtzS4abj4ixhbrUE6-BhXqtjZy6TdrU_5iACgj9ZM9yBGr3wN95oONjrCvN7hRB8qWqeJOzR6e62AKpzvsJQ7YVk2mLe6tkKhByRLfUUBwuBPtpVJJYjitIikiUFRY7UY1X_Em-Wpd3G2C-NNnc3nnsI-g33vv17igp8z5zUdcaxO4E5J4LnC34jslGCtGRFO4etvXyXPInAs165uBvhKk88MboXV3p67xvdTbLiqr1JRdyhRt0sXl46-MqPq8LGOxrsKa_xiJO-fVuXlq-3ORmpPOzeQ8-2ThjCIX_wyvEulCxJJmWgpm8FCmWhQCk4M9pgeaNIQRHcI6gS9-qblYAycMKyW6fq-TRoP5ZDJP6D0nM37PKngZHcBPenlB68FBR2Vici2zzUaUm-TdzRAcu1JfwZ818W6cGNK4e8ExQ6G6SzHat8pdYiVatzQmTgeWFzD13gikiw3203bFIzzk3HDFuE0mwL12WQqZgIteRN2oFawVb6xl9x3fyp0GWoPcJMoL_N1m54ao8YpOTEDXRJ52MVbplrdu7oItADdrtcEhBXIMhO9hCr2bOjeyRj6DhsGhQit8KzC20PVsoZ0e0jiaWpC5gnLg",
 * "results": [ { "geometry": { "location": { "lat": -33.8688197, "lng":
 * 151.2092955 }, "viewport": { "northeast": { "lat": -33.5781409, "lng":
 * 151.3430209 }, "southwest": { "lat": -34.118347, "lng": 150.5209286 } } },
 * "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png",
 * "id": "044785c67d3ee62545861361f8173af6c02f4fae", "name": "Sydney", "photos":
 * [ { "height": 452, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/115479276413292861472\">Ashutosh Kumar</a>"
 * ], "photo_reference":
 * "CmRaAAAAfrREJoPUtmjFo6coOQ9tSdf36uAYkyURVgJ8WOc3s2HDfmAMlSGYgu1w7_OX18qyR7Tn1ORBJ5tFnuQ7_QoI_-3813xhCUn2Dw7iXkucH_Gs_7nHf2wgM9YxhjYpp6vIEhBABvKY5AcaTDuVibT8OvJ2GhQGuWrofuyt7abGHhuo8D7jaSpwLQ",
 * "width": 720 } ], "place_id": "ChIJP3Sa8ziYEmsRUKgyFmh9AQM", "reference":
 * "ChIJP3Sa8ziYEmsRUKgyFmh9AQM", "scope": "GOOGLE", "types": [
 * "colloquial_area", "locality", "political" ], "vicinity": "Sydney" }, {
 * "geometry": { "location": { "lat": -33.8684714, "lng": 151.1953331 },
 * "viewport": { "northeast": { "lat": -33.8666417197085, "lng": 151.1967944 },
 * "southwest": { "lat": -33.8693396802915, "lng": 151.1931656 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png", "id":
 * "461d123aeb1c1648abdd5e535989d2bc518cf28e", "name":
 * "The Star Grand Residences (formerly Astral Residences)", "opening_hours": {
 * "open_now": true }, "photos": [ { "height": 3024, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/115068618811963078356\">Althea Maxwell</a>"
 * ], "photo_reference":
 * "CmRaAAAAQnzWga9_Zo3AWNR_yh6KYAVxnWbSIHG8_XSXqTcNcH8xrNwm6wEAtnhLMgMdVmOMeaE_TUJSPIp1wiJ8C2ZXQinRmzz4GsLhFd8zDxvAIfyKTLs7v-CZRx3r1XOGtwTsEhAdR4dsuobT_72rRyWeEUBmGhSFrpNMyByLfLqnfSJNXUQ_DDVfBA",
 * "width": 4032 } ], "place_id": "ChIJq6qq6jauEmsR46KYci7M5Jc", "plus_code": {
 * "compound_code": "45JW+J4 Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45JW+J4" }, "rating": 4.3, "reference":
 * "ChIJq6qq6jauEmsR46KYci7M5Jc", "scope": "GOOGLE", "types": [ "lodging",
 * "point_of_interest", "establishment" ], "user_ratings_total": 323,
 * "vicinity": "80 Pyrmont Street, Pyrmont" }, { "geometry": { "location": {
 * "lat": -33.87036190000001, "lng": 151.1978505 }, "viewport": { "northeast": {
 * "lat": -33.86901641970849, "lng": 151.1991304302915 }, "southwest": { "lat":
 * -33.87171438029149, "lng": 151.1964324697085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png", "id":
 * "e58f0f9ecaf15ab719d305b93265cafc00b01a3f", "name":
 * "The Little Snail Restaurant", "opening_hours": { "open_now": false },
 * "photos": [ { "height": 900, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/114727320476039103791\">The Little Snail Restaurant</a>"
 * ], "photo_reference":
 * "CmRaAAAAnJqk3qdQhSY6tz6rmwjnfNCTPKprmc36EJinwhjrGplJkkO3DQT_d8wWApE-nfM9nV-LR4-dqnS_HHWsij3mixTgHL0EzLmUzrD9dUPeHZBNhS2YDU8x17RfE3qPq8apEhAaYLPe6l6TtLX1XhPri3kdGhScJjs8bvtBt1-01wE1uxrzbeRbaA",
 * "width": 1350 } ], "place_id": "ChIJtwapWjeuEmsRcxV5JARHpSk", "plus_code": {
 * "compound_code": "45HX+V4 Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45HX+V4" }, "price_level": 2, "rating": 4.4, "reference":
 * "ChIJtwapWjeuEmsRcxV5JARHpSk", "scope": "GOOGLE", "types": [ "restaurant",
 * "food", "point_of_interest", "establishment" ], "user_ratings_total": 1067,
 * "vicinity": "3/50 Murray Street, Pyrmont" }, { "geometry": { "location": {
 * "lat": -33.8679022, "lng": 151.1951276 }, "viewport": { "northeast": { "lat":
 * -33.86672741970849, "lng": 151.1960542802915 }, "southwest": { "lat":
 * -33.86942538029149, "lng": 151.1933563197085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png", "id":
 * "0761a21e23eda2598330d428413cb59431316a61", "name": "Lobby Lounge",
 * "opening_hours": { "open_now": false }, "photos": [ { "height": 1632,
 * "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/108880141686602353602\">Andrei Setiawan Yohannes</a>"
 * ], "photo_reference":
 * "CmRaAAAAAC9kZ0uKvGod3tgec7WQvU4OjJMUdokvpPvIi8qZ5PkPd7xoz_TJGwehFgM3WdMam7ucBqBdcI_vxq9JObXiehCh90iq6NSOQFiA8brlTZQfoZ83LnQyfNMR8vqqdmWwEhBPT_dZ9YODJtcEE0iJ-XzdGhTCewptfxI-dqdni7kmJha2_4eIdA",
 * "width": 920 } ], "place_id": "ChIJ1-v38TauEmsRHbUt24abGq8", "plus_code": {
 * "compound_code": "45JW+R3 Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45JW+R3" }, "rating": 3.6, "reference":
 * "ChIJ1-v38TauEmsRHbUt24abGq8", "scope": "GOOGLE", "types": [ "cafe", "food",
 * "point_of_interest", "store", "establishment" ], "user_ratings_total": 14,
 * "vicinity": "80 Pyrmont Street, Pyrmont" }, { "geometry": { "location": {
 * "lat": -33.87039480000001, "lng": 151.196835 }, "viewport": { "northeast": {
 * "lat": -33.86895921970851, "lng": 151.1981146802915 }, "southwest": { "lat":
 * -33.8716571802915, "lng": 151.1954167197085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png", "id":
 * "1f23e4cfa2bd15544c934b22d60daedbcbfe026e", "name":
 * "Sydney Darling Harbour Hotel", "photos": [ { "height": 3024,
 * "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/114658609503160450490\">Lejan Alejandro</a>"
 * ], "photo_reference":
 * "CmRaAAAAsSUiNPkk2qPy_blT5BagQJFdmxX1nA4KtljI_8JuvnyWVzYOI4MjwsVKi3jG1VOFMCWJeR7Xy_sMIZk3sOH7vJe6Gbp0XwF0p3oouuC-moO536zGH_lECbuRkYG1_qz8EhDvf4a1C8GFezoCAkZJS2YRGhTs_NuILPgj0fvPr7xkX2FOnbQa-Q",
 * "width": 4032 } ], "place_id": "ChIJbVjtNjeuEmsRq-6prwTK24Y", "plus_code": {
 * "compound_code": "45HW+RP Sydney, New South Wales, Australia", "global_code":
 * "4RRH45HW+RP" }, "rating": 3.4, "reference": "ChIJbVjtNjeuEmsRq-6prwTK24Y",
 * "scope": "GOOGLE", "types": [ "lodging", "point_of_interest", "establishment"
 * ], "user_ratings_total": 105, "vicinity": "11 Pyrmont Bridge Road, Sydney" },
 * { "geometry": { "location": { "lat": -33.8682215, "lng": 151.1953756 },
 * "viewport": { "northeast": { "lat": -33.8670561697085, "lng":
 * 151.1962794802915 }, "southwest": { "lat": -33.8697541302915, "lng":
 * 151.1935815197085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png", "id":
 * "05bf6e9aa18b35f174f5076c348ce8e91e328aba", "name": "Flying Fish",
 * "opening_hours": { "open_now": false }, "photos": [ { "height": 5496,
 * "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/117229116771790632690\">Flying Fish</a>"
 * ], "photo_reference":
 * "CmRaAAAAdTeX058pZNyIPrcP03LXlhKKC5NHw5JyRlWD9N1inTRwqd9RBajrCd_e-_XYDyIoPSgz0vTCQZziOdgs-LVWH3eDblqmgri4Oyyr3thPpaobGHt6HiRu6lUlvTlRh395EhAOGCR2ME8oVb5FO2zRR2QXGhRD5c0Vr9yqnC9U9kXzLn2UtUsUew",
 * "width": 3865 } ], "place_id": "ChIJm7Ex8UmuEmsR37p4Hm0D0VI", "plus_code": {
 * "compound_code": "45JW+P5 Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45JW+P5" }, "price_level": 1, "rating": 4.3, "reference":
 * "ChIJm7Ex8UmuEmsR37p4Hm0D0VI", "scope": "GOOGLE", "types": [ "bar",
 * "restaurant", "food", "point_of_interest", "establishment" ],
 * "user_ratings_total": 573, "vicinity": "80 Pyrmont Street, Pyrmont" }, {
 * "geometry": { "location": { "lat": -33.8666199, "lng": 151.1958527 },
 * "viewport": { "northeast": { "lat": -33.86555361970849, "lng":
 * 151.1970993802915 }, "southwest": { "lat": -33.86825158029149, "lng":
 * 151.1944014197085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
 * "id": "4f89212bf76dde31f092cfc14d7506555d85b5c7", "name": "Google Australia",
 * "opening_hours": { "open_now": false }, "photos": [ { "height": 3024,
 * "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/105641698161404211148\">Baptiste Pichon</a>"
 * ], "photo_reference":
 * "CmRaAAAAFNfosoFpsBsHLjZotLPzhU15tz62vg8_ye9F_kLTwvAYNethpo_vryapno0lSssaOlHJGcD1kNnv_oO37617rTxg5YgHvbYbPs9UYqYwxJLeDkApPqH6Ebb-P5N7Mb48EhCd3yu7U8oddJS0Ha_hEONBGhSZYlDjPbpoDRrIu6gaMYIPJe-hVw",
 * "width": 4032 } ], "place_id": "ChIJN1t_tDeuEmsRUsoyG83frY4", "plus_code": {
 * "compound_code": "45MW+98 Sydney, New South Wales, Australia", "global_code":
 * "4RRH45MW+98" }, "rating": 4.1, "reference": "ChIJN1t_tDeuEmsRUsoyG83frY4",
 * "scope": "GOOGLE", "types": [ "point_of_interest", "establishment" ],
 * "user_ratings_total": 838, "vicinity": "48 Pirrama Road, Sydney" }, {
 * "geometry": { "location": { "lat": -33.8639741, "lng": 151.1945507 },
 * "viewport": { "northeast": { "lat": -33.8626129197085, "lng":
 * 151.1958782802915 }, "southwest": { "lat": -33.8653108802915, "lng":
 * 151.1931803197085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
 * "id": "64962a18758210c49bb59bdf6f1f76c333a70e1b", "name": "Jones Bay Wharf",
 * "photos": [ { "height": 3024, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/104776078532152149820\">Maksym Kozlenko</a>"
 * ], "photo_reference":
 * "CmRaAAAAQ64TyXS8pYxmTTAdKq4bqgOz0c0xBX0ZI-blcV8c9nCozzirSEmbZSr2iR7chYEypSoFZ5Vigc1e1_YtQVZGFactsBwCxYy1ncZeN4ENMQ3N-61XuEf7btN6b505xDlOEhBqsjUWI4WOH4vqgGZMRJKbGhSn_-tsNmuJbFIP9O6lzIh683FE9Q",
 * "width": 4032 } ], "place_id": "ChIJw1jiuEmuEmsRic0640-IS-k", "plus_code": {
 * "compound_code": "45PV+CR Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45PV+CR" }, "rating": 4.5, "reference":
 * "ChIJw1jiuEmuEmsRic0640-IS-k", "scope": "GOOGLE", "types": [
 * "real_estate_agency", "point_of_interest", "establishment" ],
 * "user_ratings_total": 170, "vicinity":
 * "Piers 19-21 26, 32/58 Pirrama Road, Pyrmont" }, { "geometry": { "location":
 * { "lat": -33.86479, "lng": 151.194134 }, "viewport": { "northeast": { "lat":
 * -33.8636268697085, "lng": 151.1953590302915 }, "southwest": { "lat":
 * -33.8663248302915, "lng": 151.1926610697085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
 * "id": "f01affffaff254a9b812eaffa905c3fb728c854b", "name":
 * "Doltone House - Jones Bay Wharf", "opening_hours": { "open_now": false },
 * "photos": [ { "height": 270, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/108156930776082579501\">Doltone House - Jones Bay Wharf</a>"
 * ], "photo_reference":
 * "CmRaAAAApa89gtNHaVS1YHv7WGoHCOOun5qgv4eySGxsujR09KSmF6F0lS1J9YvAOOvJn9LfcDF-FlCZLGRIMFs1ZfOTLJKskAxtZGLGl4Ha-WdDJy8fv59voxPbdHFtOdJGytwZEhAVCbOzav6QMtF_qnTe4nzXGhQmJKSdLLSlVnSxWwROfJxgEDfKMw",
 * "width": 480 } ], "place_id": "ChIJr9ZMJD6uEmsRT5yQWJvTmd0", "plus_code": {
 * "compound_code": "45PV+3M Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45PV+3M" }, "price_level": 2, "rating": 4.4, "reference":
 * "ChIJr9ZMJD6uEmsRT5yQWJvTmd0", "scope": "GOOGLE", "types": [ "food",
 * "point_of_interest", "establishment" ], "user_ratings_total": 667,
 * "vicinity": "level 3/26-32 Pirrama Road, Pyrmont" }, { "geometry": {
 * "location": { "lat": -33.867567, "lng": 151.193742 }, "viewport": {
 * "northeast": { "lat": -33.8661965697085, "lng": 151.1951454802915 },
 * "southwest": { "lat": -33.8688945302915, "lng": 151.1924475197085 } } },
 * "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/restaurant-71.png", "id":
 * "00060cf64f16375913ec49d25cbb7829d3e08a88", "name":
 * "Blue Eye Dragon Taiwanese Restaurant", "opening_hours": { "open_now": false
 * }, "photos": [ { "height": 1153, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/114550096924148386356\">Blue Eye Dragon Taiwanese Restaurant</a>"
 * ], "photo_reference":
 * "CmRaAAAAREGDDKRH-zlPALCAv_3nIMrymgIGjtwKqbXu_sKLXk6XgqnQt2sv8Tv1bIP-VDfg4ab_Bad59MOvxEPN1MQMhnO8VAJUQJSr_Uc1Xv65cNENqaHy1Oe7XAw2n_-yzSXiEhCHJyRPBSnFTcrm-4bKWNkuGhQizQEecPxZVuDeCNXSVxhQkRMrOw",
 * "width": 2048 } ], "place_id": "ChIJuZqIiTauEmsRJF_TK9Vpfmw", "plus_code": {
 * "compound_code": "45JV+XF Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45JV+XF" }, "price_level": 2, "rating": 4.5, "reference":
 * "ChIJuZqIiTauEmsRJF_TK9Vpfmw", "scope": "GOOGLE", "types": [ "meal_delivery",
 * "restaurant", "food", "point_of_interest", "establishment" ],
 * "user_ratings_total": 210, "vicinity": "37 Pyrmont Street, Pyrmont" }, {
 * "geometry": { "location": { "lat": -33.8693567, "lng": 151.1986328 },
 * "viewport": { "northeast": { "lat": -33.8680827697085, "lng":
 * 151.1997738302915 }, "southwest": { "lat": -33.87078073029149, "lng":
 * 151.1970758697085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/museum-71.png", "id":
 * "45ffedee792e73666af7df087facf2ddb4509085", "name":
 * "Australian National Maritime Museum", "opening_hours": { "open_now": false
 * }, "photos": [ { "height": 3024, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/100850752794968092166\">Geraldine Campbell</a>"
 * ], "photo_reference":
 * "CmRaAAAAKOCbD76GZi8ra-FgZF2Jq9JH-1WFWtwsSZrZw539oFKTnPvwFtxq4YZmQng-CIADE-GNr_TooPmPBoWcZkrMe16dE8fn2TLI17WmdV2sEYBzb9WRXCkd-qmJPlBqjjYjEhAZ1hSJAtnJEWF-mAMpDM3yGhTrwq2ci8CFTz3gkH6ELSobaqUpYw",
 * "width": 4032 } ], "place_id": "ChIJTze93zmuEmsRhvE6T4Y9DhU", "plus_code": {
 * "compound_code": "45JX+7F Sydney, New South Wales, Australia", "global_code":
 * "4RRH45JX+7F" }, "rating": 4.5, "reference": "ChIJTze93zmuEmsRhvE6T4Y9DhU",
 * "scope": "GOOGLE", "types": [ "tourist_attraction", "museum",
 * "point_of_interest", "establishment" ], "user_ratings_total": 2757,
 * "vicinity": "2 Murray Street, Sydney" }, { "geometry": { "location": { "lat":
 * -33.8701668, "lng": 151.1969343 }, "viewport": { "northeast": { "lat":
 * -33.8688145697085, "lng": 151.1983141302915 }, "southwest": { "lat":
 * -33.8715125302915, "lng": 151.1956161697085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png", "id":
 * "f846ea9b42a8a8d1e86984346807fb25720db412", "name": "Fawlty Towers Hotel",
 * "photos": [ { "height": 4032, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/118362782730053041510\">Liz Thompson</a>"
 * ], "photo_reference":
 * "CmRaAAAAx4VOkXrmXdbaf0bcNipg5A1wMj5-vN-eQE2HGOQQL5YCQZ4smDX5bPVF326dsdj-M_lvBfIK1w76_1VNMwyacQxtHYE8vDkOb_D5VagSFP2WtntICd7MfR1HDYQ4IWZpEhDxVA7t25zCQcsYN-FNL4EPGhToKdRP4ykjv2_xKRdb2-z0bLg3WQ",
 * "width": 1960 } ], "place_id": "ChIJ6xF3NzeuEmsRtnM-LJiQKCA", "plus_code": {
 * "compound_code": "45HW+WQ Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45HW+WQ" }, "rating": 2.9, "reference":
 * "ChIJ6xF3NzeuEmsRtnM-LJiQKCA", "scope": "GOOGLE", "types": [ "lodging",
 * "point_of_interest", "establishment" ], "user_ratings_total": 7, "vicinity":
 * "11 Pyrmont Bridge Road, (Corner of Pyrmont Bridge RD and, Harwood Street, Pyrmont"
 * }, { "geometry": { "location": { "lat": -33.8685224, "lng": 151.1961453 },
 * "viewport": { "northeast": { "lat": -33.8671054697085, "lng":
 * 151.1977389802915 }, "southwest": { "lat": -33.8698034302915, "lng":
 * 151.1950410197085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
 * "id": "172b11b0164ac9ae1f16c6802ed759445f6eacb7", "name":
 * "Sydney Lyric Theatre", "photos": [ { "height": 1280, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/106181226772401075883\">Sydney Lyric Theatre</a>"
 * ], "photo_reference":
 * "CmRaAAAAIFZhO_lVp8XibAQ3jBRY6gDtMChcWvuFEr7tQQII3S-G_jdJLfc7pjnIeI5xD_ta_Nwc5Ok-p2cpHzC5R8HBAMSk-oRNhM3mdR5k6ByLYmfiePAxoADTZt8HclCGeOqbEhDQV-aQZ0je2cvNuu0EQUTCGhRxRV6vUal525XUycIcOW7yGW201A",
 * "width": 2048 } ], "place_id": "ChIJ1-v38TauEmsRxXV8BJ53Fq4", "plus_code": {
 * "compound_code": "45JW+HF Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45JW+HF" }, "rating": 4.5, "reference":
 * "ChIJ1-v38TauEmsRxXV8BJ53Fq4", "scope": "GOOGLE", "types": [
 * "point_of_interest", "establishment" ], "user_ratings_total": 2093,
 * "vicinity": "55 Pirrama Road, Pyrmont" }, { "geometry": { "location": {
 * "lat": -33.8667062, "lng": 151.1957844 }, "viewport": { "northeast": { "lat":
 * -33.8652870697085, "lng": 151.1968761302915 }, "southwest": { "lat":
 * -33.8679850302915, "lng": 151.1941781697085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
 * "id": "3ef986cd56bb3408bc1cf394f3dad9657c1d30f6", "name":
 * "Doltone House - Darling Island", "opening_hours": { "open_now": false },
 * "photos": [ { "height": 270, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/108270736464416141350\">Doltone House - Darling Island</a>"
 * ], "photo_reference":
 * "CmRaAAAAAg5tur_GiaSI4vW_uk-thpxd5JJP3cpn2WWV1NqSNO_S5cWORpk42PHjqAyMDGxkOQllYEsLa2c1gmWuo2ZwsikP2D84NRWofjk3a4oxuvNyV6x5LjwiWk47lgC2JTafEhDCQaf488uHlp55cJ36IuX1GhTgoml6zq1maKcELhXaP2XYPd-mIw",
 * "width": 480 } ], "place_id": "ChIJ5xQ7szeuEmsRs6Kj7YFZE9k", "plus_code": {
 * "compound_code": "45MW+88 Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45MW+88" }, "rating": 4.3, "reference":
 * "ChIJ5xQ7szeuEmsRs6Kj7YFZE9k", "scope": "GOOGLE", "types": [ "food",
 * "point_of_interest", "establishment" ], "user_ratings_total": 324,
 * "vicinity": "Ground Floor/48 Pirrama Road, Pyrmont" }, { "geometry": {
 * "location": { "lat": -33.8636013, "lng": 151.1944983 }, "viewport": {
 * "northeast": { "lat": -33.8626520697085, "lng": 151.1953469802915 },
 * "southwest": { "lat": -33.86535003029149, "lng": 151.1926490197085 } } },
 * "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
 * "id": "7f4a3fdd07bb7911b51838d1c9055b08ee1c9293", "name": "Cafe Morso",
 * "opening_hours": { "open_now": false }, "photos": [ { "height": 534,
 * "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/113583986869543550599\">Cafe Morso</a>"
 * ], "photo_reference":
 * "CmRaAAAAb4g4plXRpKoESk7N-4SXq5fuuQNuYuhCpq4hPm5ecswt6kfVjCZcMv2N8aKTvq28I_Ml9Vl8rNewFqwzcB2PQO0ncB5sUJuhBe3fENk5MRmvB6qTz29czUigIsOPSJQSEhA3ipNlmK-hx9O1Pdko7P8HGhQqqMF0HEZ1q_bOD-vGhFmWid5A3Q",
 * "width": 800 } ], "place_id": "ChIJz2EHuEmuEmsRN_yScfn88Ec", "plus_code": {
 * "compound_code": "45PV+HQ Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45PV+HQ" }, "price_level": 2, "rating": 4.3, "reference":
 * "ChIJz2EHuEmuEmsRN_yScfn88Ec", "scope": "GOOGLE", "types": [ "cafe", "bar",
 * "restaurant", "food", "point_of_interest", "store", "establishment" ],
 * "user_ratings_total": 299, "vicinity": "108/26-32 Pirrama Road, Pyrmont" }, {
 * "geometry": { "location": { "lat": -33.8684448, "lng": 151.192034 },
 * "viewport": { "northeast": { "lat": -33.86706641970849, "lng":
 * 151.1934556302915 }, "southwest": { "lat": -33.86976438029149, "lng":
 * 151.1907576697085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png", "id":
 * "512c71c6f028bac788b91cc2ceb63c0b9b2862c5", "name":
 * "3 Bed House Pyrmont 15m", "opening_hours": { "open_now": false }, "photos":
 * [ { "height": 2400, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/111318227224928907687\">3 Bed House Pyrmont 15m</a>"
 * ], "photo_reference":
 * "CmRaAAAAK4TTFXwZzVbDiUvAEzTfRr73tuI9xoyYBIt5VGceujqS4C_AdK2Q7dyDbI_IIE3x5n-QhZEPiZ5EBoQ53xSkGAcGJeh1fuzW6ai1by4jiBUniwxmGT1vfsk1AmEKb4UsEhBDDERWSQhpbPRN2P9_4RUCGhSIsPTSGzq0yFfhL5iWqC9J3awOaA",
 * "width": 3595 } ], "place_id": "ChIJaYbYGTSuEmsRR6vetgTSVXo", "plus_code": {
 * "compound_code": "45JR+JR Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45JR+JR" }, "reference": "ChIJaYbYGTSuEmsRR6vetgTSVXo",
 * "scope": "GOOGLE", "types": [ "lodging", "point_of_interest", "establishment"
 * ], "vicinity": "15 Mount Street, Pyrmont" }, { "geometry": { "location": {
 * "lat": -33.8692322, "lng": 151.1963676 }, "viewport": { "northeast": { "lat":
 * -33.8678717197085, "lng": 151.1976365802915 }, "southwest": { "lat":
 * -33.8705696802915, "lng": 151.1949386197085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
 * "id": "474bd6e52a048320cb1b2101a79316800bf63ac3", "name":
 * "InterPark Australia Pty Ltd", "opening_hours": { "open_now": false },
 * "photos": [ { "height": 4096, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/114105808613703982054\">Cường Quản</a>"
 * ], "photo_reference":
 * "CmRaAAAAJ5p2J6n5QCrk8Yz-6goI50N8gl_zTpg3ZrGBN7yEoKCtSqUK6tSyj1lSFu26gF5BWTI1-vMvV2eT-XknskW4nnyrGi40LLqot7TXIwlMdy7mL9OomblbRehwv-WN9AwwEhCjFgs6fmYAKmKuFvbZNpd4GhQjbKLvK-dsXfw9xevadwv7ROyoDw",
 * "width": 2304 } ], "place_id": "ChIJ43uUIzeuEmsRUhXrDirPu7M", "plus_code": {
 * "compound_code": "45JW+8G Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45JW+8G" }, "rating": 3.8, "reference":
 * "ChIJ43uUIzeuEmsRUhXrDirPu7M", "scope": "GOOGLE", "types": [ "parking",
 * "point_of_interest", "establishment" ], "user_ratings_total": 17, "vicinity":
 * "2 Edward Street, Pyrmont" }, { "geometry": { "location": { "lat":
 * -33.8698377, "lng": 151.1977105 }, "viewport": { "northeast": { "lat":
 * -33.8685425197085, "lng": 151.1991071802915 }, "southwest": { "lat":
 * -33.8712404802915, "lng": 151.1964092197085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/bar-71.png", "id":
 * "c2075046e4cb0763631f4d8a562f88fe8500ba25", "name": "Pyrmont Bridge Hotel",
 * "opening_hours": { "open_now": true }, "photos": [ { "height": 467,
 * "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/109347238166167841861\">Pyrmont Bridge Hotel</a>"
 * ], "photo_reference":
 * "CmRaAAAAB8jv9WEgkMHXECqbkWRmcjLe2lGsQNqkad0lbijW9swoxOd50kNhbCG8ZlMSrh-gZMFjkJJkBa5IPWictxkxvyOCE9BwbTSuc713KbRVi7VpAYi0mBvPk8ThmlWL0KYaEhBeUkorYkKjhuff2tSRDPPnGhRrnuHbvP6V_ivC_4VvnGfWva7HDw",
 * "width": 700 } ], "place_id": "ChIJAzQBQzeuEmsRh4OdJApC4MU", "plus_code": {
 * "compound_code": "45JX+33 Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45JX+33" }, "price_level": 1, "rating": 3.9, "reference":
 * "ChIJAzQBQzeuEmsRh4OdJApC4MU", "scope": "GOOGLE", "types": [ "bar",
 * "point_of_interest", "establishment" ], "user_ratings_total": 2030,
 * "vicinity": "96 Union Street, Pyrmont" }, { "geometry": { "location": {
 * "lat": -33.86966699999999, "lng": 151.194526 }, "viewport": { "northeast": {
 * "lat": -33.86825551970849, "lng": 151.1958710302915 }, "southwest": { "lat":
 * -33.87095348029149, "lng": 151.1931730697085 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png",
 * "id": "e43a8ffcd20e16efc75b5b1c6f8758e09de33fda", "name":
 * "Star Cosmetic Medicine", "opening_hours": { "open_now": false }, "photos": [
 * { "height": 800, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/105494414267269064005\">Star Cosmetic Medicine</a>"
 * ], "photo_reference":
 * "CmRaAAAAbRYg4ILdh-NEaAusnsmu9XAzJ6LqoB3RynDZ3lQjhPpSuMv0Jnj5486AC2WWwnoBE5JlviMBv4klnn-p-KJl7LXwPC0AqY33EmlmPTWLO23xDXqrSxLDcBOTsYySxTGVEhC0R3X31l6gF80ElTuxQDWLGhQ1fUx0u672TpshjmNRIP8-uoBBMA",
 * "width": 1364 } ], "place_id": "ChIJ____EzCuEmsRQ1hZQrX8z8A", "plus_code": {
 * "compound_code": "45JV+4R Pyrmont, New South Wales, Australia",
 * "global_code": "4RRH45JV+4R" }, "rating": 4.5, "reference":
 * "ChIJ____EzCuEmsRQ1hZQrX8z8A", "scope": "GOOGLE", "types": [ "beauty_salon",
 * "doctor", "spa", "health", "point_of_interest", "establishment" ],
 * "user_ratings_total": 48, "vicinity": "1 Union Street, Pyrmont" }, {
 * "geometry": { "location": { "lat": -33.8688197, "lng": 151.2092955 },
 * "viewport": { "northeast": { "lat": -33.8561088, "lng": 151.222951 },
 * "southwest": { "lat": -33.8797035, "lng": 151.1970329 } } }, "icon":
 * "https://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png", "id":
 * "33e35d1925474acf2e3a2a509144aff306ef7962", "name": "Sydney", "photos": [ {
 * "height": 500, "html_attributions": [
 * "<a href=\"https://maps.google.com/maps/contrib/111232171267011000027\">sam d</a>"
 * ], "photo_reference":
 * "CmRaAAAAMirayt9AdnFCgeAk4dJdMO0Sw6SS2bI9mFcabonOF8jiVDo_Sy6KZnwPnProk7Idb6gV3zj8ZPGS4n0cnShrBnea2UP12nlvvp097mBalLCJBU6D-4uy4GCmZ6GBO7dfEhD9Y4GSefdUKC11qxuiEuDzGhQTcT8FSZcuOtaPyJKK5hykfIFlgA",
 * "width": 800 } ], "place_id": "ChIJP5iLHkCuEmsRwMwyFmh9AQU", "reference":
 * "ChIJP5iLHkCuEmsRwMwyFmh9AQU", "scope": "GOOGLE", "types": [ "locality",
 * "political" ], "vicinity": "Sydney" } ], "status": "OK" }
 * 
 * 
 * 
 */
