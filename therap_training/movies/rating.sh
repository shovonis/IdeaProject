#clearing the shell
clear
#movielist
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
  <th>Ratings</th> 
</tr>" >> ratings.html
		

while read line
do
   echo "<tr class="alt">" >> ratings.html 
   wget -O search_result.html -o tmp --user-agent Mozilla "https://www.google.com.bd/search?q=${line}"
   echo "<td><a href=\"`pwd`/$line\">$line</a></td>" >> ratings.html
   echo "<td>" >> ratings.html 
   grep -i -o "Rating:[ ][0-9][.]*[0-9]*[/][0-9][0-9]" search_result.html | cut -b 9-14 >> ratings.html
   echo "</td>" >> ratings.html  
   echo "</tr>"	>> ratings.html 
done < movielist

 echo "</table>
		</body>
		</html>"  >> ratings.html







