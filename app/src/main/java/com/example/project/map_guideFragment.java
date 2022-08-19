package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

public class map_guideFragment extends Fragment {

    public map_guideFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_mapguide, container, false);
        WebView webview = view.findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        String url="https://www.google.com/maps/dir/?api=1&"+"origin="+"桃園市蘆竹區南崁國民小學"+"&destination="+"復旦高級中學"+"&travelmode=bicycling"+
                "&waypoints="+"吉林公園"+"%7C"+"桃園市內壢高級中等學校";
        webview.loadUrl(url);
        return view;
    }
}
