//1. Recursively Flatten Playlist (Songs + Sub-Playlists)
void flatten(Playlist p, List<Song> out){
 for(Item it : p.items){
   if(it is Song) out.add(it);
   else flatten(it.playlist, out);   // recurse into sub-playlist
 }
}
