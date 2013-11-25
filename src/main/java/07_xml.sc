import scala.xml.XML

val xml =
  "<person>" +
    "<ime>Slavko</ime>" +
    "<priimek>Zitnik</priimek>" +
    "<naslov tip='domaci'>" +
      "<ulica>Vrbicje 4</ulica>" +
      "<posta>1290 Grosuplje</posta>" +
      "<mesto>Grosuplje</mesto>" +
    "</naslov>" +
  "</person>"



val xmlObj = XML loadString xml


xmlObj \\ "person" text


xmlObj \\ "person" \ "ime" text

val addresses = xmlObj \\ "person" \\ "naslov"

addresses.foreach(node => {
  if ((node \ "@tip").text.equals("domaci")) {
    print(node text)
  }
})





