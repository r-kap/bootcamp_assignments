package com.ttn.bootcamp.core.models;

import com.day.cq.dam.api.Asset;
import com.day.cq.dam.api.Rendition;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.List;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AssetModel {

    private String image;

    @SlingObject
    private SlingHttpServletRequest request;

    @Inject @Via("resource")
    private String assetPath;

    @Inject @Via("resource")
    private String resolution;




    @PostConstruct
    protected void init()
    {
        ResourceResolver resourceResolver = request.getResourceResolver();
       Resource resource = resourceResolver.getResource(assetPath);

        if(resource!=null)
        {
            Asset asset = resource.adaptTo(Asset.class);
                if(asset!=null)
                {
                 image = asset.getOriginal().getPath();
                 for(Rendition rendition : asset.getRenditions())
                 {
                     if (rendition.getName().endsWith((resolution).concat(".png")))
                     {
                         image=rendition.getPath();
                     }
                 }
                }

        }


    }


    public String getAssetPath(){
        return assetPath;
    }

    public String getResolution(){
        return resolution;
    }

    public String getImage(){
        return image;
    }

}
