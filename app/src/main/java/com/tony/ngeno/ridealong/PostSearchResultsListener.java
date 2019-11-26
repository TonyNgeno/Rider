package com.tony.ngeno.ridealong;

import com.tony.ngeno.ridealong.models.Carpool;
import com.tony.ngeno.ridealong.models.Post;

import java.util.ArrayList;


public interface PostSearchResultsListener {
    void onSearchResultsFound(ArrayList<Post> searchResults, ArrayList<Carpool> potentialCarpools);
}
