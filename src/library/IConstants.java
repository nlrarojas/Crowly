package library;


public interface IConstants {
	public final String POST_BODY = "{ \"url\":\"@@URL@@\" }";

	public final String MCS_URL = "https://westus.api.cognitive.microsoft.com/video/v1.0/detectmotion?sensitivityLevel=low&frameSamplingValue=1";

	public final String[] LISTA_VIDEOS = {
			"https://drive.google.com/open?id=0BzLxbhwNG5HrYlBkaXhJbGhWalk"
			//"https://westus.api.cognitive.microsoft.com/video/v1.0/operations/3b5fada9-c5fc-4f4a-a1b2-71fac13cc291"
			//"http://gdurl.com/9KHx"
			//"http://gdurl.com/KJdf",
			//"http://gdurl.com/2s3O"
			//"https://www.dropbox.com/s/nhc9xsxlnsn0bv8/WIN_20170503_15_26_09_Pro.mp4?dl=0"
	};
	
	public final String JSON_FILE_NAME = "C:/Users/Nelson/OneDrive/U/Tercer Semestre/POO/SegundoProyecto/jsonexample.json";
	
	public final String LOCATION_RESULT_URL_KEY = "Operation-Location";
	public final String LOCATION_RESULT_ACCESS_KEY = "apim-request-id";
	public final String CAMBIO_LINEA = "\n";

	public final int ESPERA_ENTRE_LLAMADAS = 60000;

	public final String MCS_IDKEY = "ece1583bdbdd4b3594b44c569eaec1fe";//"799dca11f3ca4e67b75c9aa34848823b";f1c00a27984443de8293598a9ee6b818

	public final String HTML_FILE_SAVE_NAME = "Crowly-GUID.html";
	
	public final String HTML_CONTENT_BODY = "<html>"
			+ "<head>"
			+ "<!--Load the AJAX API-->" 
			+ "<script type='text/javascript' src='https://www.gstatic.com/charts/loader.js'></script>" 
			+ "<script type='text/javascript'>" 
			+ "// Load the Visualization API and the corechart package." 
			+ "google.charts.load('current', {'packages':['corechart']});"
			+ "// Set a callback to run when the Google Visualization API is loaded. "
			+ "google.charts.setOnLoadCallback(drawChart);" 
			+ "// Callback that creates and populates a data table," 
			+ "// instantiates the pie chart, passes in the data and"
			+ "// draws it."
			+ "function drawChart() {"
			+ "// Create the data table."
			+ "var data = new google.visualization.DataTable();"
			+ "data.addColumn('string', 'Cantidad de personas');"
			+ "data.addColumn('number', 'Slices');"
			+ "data.addRows(@@DataArray@@);"
			+ "// Set chart options"
			+ "var options = {'title':@@Tittle@@,"
			+ "'width':400,"
			+ "'height':300};"
			+ "// Instantiate and draw our chart, passing in some options." 
			+ "var chart = new google.visualization.@@ChartTipe@@(document.getElementById('chart_div'));"
			+ "chart.draw(data, options);"
			+ "}"
			+ "</script>"
			+ "</head>" 
			+ "<body>"
			+ "<!--Div that will hold the pie chart-->"
			+ "<div id='chart_div'></div>"
			+ "</body>"
			+ "</html>";
}
