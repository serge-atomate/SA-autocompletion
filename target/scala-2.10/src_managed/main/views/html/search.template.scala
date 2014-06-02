
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Search],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(searchForm: Form[Search]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main("GoPubMed® - Transinsight's semantic search for the life sciences")/*6.74*/ {_display_(Seq[Any](format.raw/*6.76*/("""
	<div class="main">

		<div class="search-form">

			<div class="Banner"></div>


    		"""),_display_(Seq[Any](/*14.8*/form(routes.Searches.newSearch())/*14.41*/ {_display_(Seq[Any](format.raw/*14.43*/("""
				<div class="input-group">

	        		<!-- """),_display_(Seq[Any](/*17.18*/inputText(searchForm("term"), '_label -> "IP", 'placeholder -> "IP"))),format.raw/*17.86*/("""  -->
			      	<input type="text" class="form-control" autocomplete="off" data-provide="typeahead" id="term" name="term">
			      	<span class="input-group-btn">
			        	<!-- <button class="btn  greenButtonFind" type="button">Find!</button> -->
	        			<input type="submit" value="Find!" class="btn greenButtonFind">  
			      	</span>
			    </div><!-- /input-group -->
    		""")))})),format.raw/*24.8*/("""

	    </div>

	</div>


	<script>
	  	$(document).ready(function() """),format.raw/*32.34*/("""{"""),format.raw/*32.35*/("""
	  		// alert('df');
	  	"""),format.raw/*34.5*/("""}"""),format.raw/*34.6*/(""");
	</script>
""")))})))}
    }
    
    def render(searchForm:Form[Search]): play.api.templates.HtmlFormat.Appendable = apply(searchForm)
    
    def f:((Form[Search]) => play.api.templates.HtmlFormat.Appendable) = (searchForm) => apply(searchForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 26 22:44:43 CEST 2014
                    SOURCE: /Users/serge/autocompletion/app/views/search.scala.html
                    HASH: e8e63a796c5e1e897fa86da1bd04a96fde946bd5
                    MATRIX: 781->1|951->27|979->80|1015->82|1095->154|1134->156|1259->246|1301->279|1341->281|1426->330|1516->398|1936->787|2032->855|2061->856|2114->882|2142->883
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|43->14|43->14|43->14|46->17|46->17|53->24|61->32|61->32|63->34|63->34
                    -- GENERATED --
                */
            