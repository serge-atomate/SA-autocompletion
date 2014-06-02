
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("GoPubMed® - Transinsight's semantic search for the life sciences")/*3.74*/ {_display_(Seq[Any](format.raw/*3.76*/("""

    <div>

		<div class="input-group">
	      <span class="input-group-btn">
	        <button class="btn btn-default" type="button">Go!</button>
	      </span>
	      <input type="text" class="form-control">
	    </div><!-- /input-group -->

	</div>


<script>
  	$(document).ready(function() """),format.raw/*18.33*/("""{"""),format.raw/*18.34*/("""
  		// alert('df');
  	"""),format.raw/*20.4*/("""}"""),format.raw/*20.5*/(""");
</script>

""")))})),format.raw/*23.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 26 22:26:57 CEST 2014
                    SOURCE: /Users/serge/autocompletion/app/views/index.scala.html
                    HASH: fdac4373d3e7b637d9107af69c74c39ee323d020
                    MATRIX: 774->1|885->18|922->21|1002->93|1041->95|1364->390|1393->391|1444->415|1472->416|1518->431
                    LINES: 26->1|29->1|31->3|31->3|31->3|46->18|46->18|48->20|48->20|51->23
                    -- GENERATED --
                */
            