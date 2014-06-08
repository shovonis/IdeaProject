#clearing the shell
clear
#movielist
rm -fr tmpList
ls -d */ > movielist 

rm -fr ratings.html 
echo "<head>
<style>
#customers
{
font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
width:100%;
border-collapse:collapse;
}
#customers td, #customers th 
{
font-size:1em;
border:1px solid #98bf21;
padding:3px 7px 2px 7px;
}
#customers th 
{
font-size:1.1em;
text-align:left;
padding-top:5px;
padding-bottom:4px;
background-color:#A7C942;
color:#ffffff;
}
#customers tr.alt td 
{
color:#000000;
background-color:#EAF2D3;
}
</style>
</head>
<body>
" >> ratings.html

echo "<table id="customers">
<tr>
  <th>Movies</th>
  <th>IMDB Ratings</th> 
</tr>" >> ratings.html
		
echo "downloading movie ratings"
while read line 
do 
var=`echo $line | sed -r 's/x[0-9]+//g' | sed -r 's/[0-9]+p//g' | sed -r 's/anoXmous//g' | sed -r 's/BluRay//g' | sed -r 's/YIFY//g' | sed -r 's/BRRi//g' | sed -r 's/BDRi//g' | sed -r 's/H264//g' | sed -r 's/AC3//g' | sed -r 's/XviD//g' | sed -r 's/JYK//g' | sed -r 's/AAC//g' | sed -r 's/ViSiON//g' | sed -r 's/-tomcat12//g' | sed -r 's/HDLiTE//g' | sed -r 's/[.]+Goo[.]+//g' | sed -r 's/Cody//g' | sed -r 's/HDTV//g' | sed -r 's/PublicHD//g' | sed -r 's/WEB-DL//g' | sed -r 's/Kingdom-Release//g' | sed -r 's/bluray//g' | sed -r 's/BRRIP//g' |  sed -r 's/KiNGDOM//g' | sed -r 's/DD5.1 EN NL Subs//g' | sed -r 's/Asian Torrenz//g' | sed -r 's/Bluray//g' |  sed -r 's/Dual Eng Latino//g' | sed -r 's/Pitu//g' | sed -r 's/DTS//g'  | sed -r 's/multisub HighCode//g' | sed -r 's/6Chn//g' | sed -r 's/BrRi//g'| sed -r 's/BRri//g' | sed -r 's/PROPER//g' | sed -r 's/SiNNERS//g' | sed -r 's/MZON3//g' | sed -r 's/RARBG//g' | sed -r 's/5.1 ch-SecretMyth//g'  | sed -r 's/LEGi0N//g' | sed -r 's/ETRG//g' | sed -r 's/m-HD//g' | sed -r 's/m4 -CC//g'| sed -r 's/Trilogy//g' | sed -r 's/Jalucian//g'| sed -r 's/HDS//g'| sed -r 's/Extended.Cut.....dxva//g' |sed -r 's/AMIABLE//g'| sed -r 's/FXG//g' | sed -r 's/Remastered.SE//g' | sed -r 's/SPARKS//g'| sed -r 's/Extended Cut (2012)//g' | sed -r 's/dxva//g' | sed -r 's/26K//g' | sed -r 's/DD5.1 FLiCKSiCK//g' | sed -r 's/m4//g' | sed -r 's/CC//g'| sed -r 's/Franchise//g' | sed -r 's/Ameet6233//g'| sed -r 's/DvDri//g' | sed -r 's/3Li//g'| sed -r 's/Audrey.Heburn//g' | sed -r 's/honchorella//g' | sed -r 's/GreatMagician//g' | sed -r 's/BeLLBoY//g' | sed -r 's/H.264//g'| sed -r 's/GreatMagician//g' | sed -r 's/\[[a-zA-Z0-9]*\]//g' | sed -r 's/Feel-Free//g' | sed -r 's/NeRoZ//g'| sed -r 's/WEB+[a-zA-Z]*//g'| sed -r 's/720//g' | sed -r 's/HD+[a-zA-Z0-9]*//g' | sed -r 's/[ ][.]+p[ ][.]//g' | sed -r 's/[0-9]+p//g' | sed -r 's/2.0.-tar//g' | sed -r 's/Criterion//g' | sed -r 's/CODY//g' | sed -r 's/Dual Audio//g' | sed -r 's/NODLABS//g' | sed -r 's/Hi10P//g'  | sed -r 's/DirCut//g'  | sed -r 's/TheFalcon007//g' | sed -r 's/-SecretMyth//g' | sed -r 's/~SaaS~//g'  | sed -r 's/PRiSTiNE//g'| sed -r 's/Kingdom Release//g'| sed -r 's/[ ]+p+//g'| sed -r 's/[.]+p+[.]+//g'| sed -r 's/Hin-Eng//g'| sed -r 's/Audrey.Hepburn//g'| sed -r 's/Cut//g' | sed -r 's/Gopo//g' | sed -r 's/ReRip//g'| sed -r 's/Box Set//g' |sed -r 's/Unchainedp//g' |sed -r 's/Squadp//g' |sed -r 's/DC//g' |sed -r 's/DvDRip//g' |sed -r 's/Extended//g'|sed -r 's/Masta//g'|sed -r 's/aXXo//g' |sed -r 's/Vice//g'|sed -r 's/X264//g'`
echo $var;
echo "<tr class="alt">" >> ratings.html 
wget -O search_result.html -o tmp --user-agent Mozilla "http://www.bing.com/search?q=${var}"
echo "<td><a href=\"`pwd`/$line\">$line</a></td>" >> ratings.html
echo "<td>" >> ratings.html 
grep -i -o "Rating:[ ][0-9][.]*[0-9]*[/][0-9][0-9]" search_result.html | cut -b 9-14 | head -1 >> ratings.html
echo "</td>" >> ratings.html  
echo "</tr>"	>> ratings.html 
done < movielist

echo "</table>
		</body>
		</html>"  >> ratings.html







