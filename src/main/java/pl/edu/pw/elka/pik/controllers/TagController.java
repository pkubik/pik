package pl.edu.pw.elka.pik.controllers;

import org.springframework.web.bind.annotation.*;
import pl.edu.pw.elka.pik.entities.Player;
import pl.edu.pw.elka.pik.entities.Tag;
import pl.edu.pw.elka.pik.services.PlayerService;
import pl.edu.pw.elka.pik.services.TagService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

/**
 * @author pkubik
 */
@RestController
@SuppressWarnings( "unused" )
public class TagController
{

    private final TagService tagService;

    @Inject
    public TagController(TagService tagService)
    {
        this.tagService = tagService;
    }

    @RequestMapping(value="/tag/{id}", method = RequestMethod.GET)
    public Tag getTag(@PathVariable(value="id") Long id)
    {
        return tagService.getTag(id);
    }


    @RequestMapping(value="/tag/search", method = RequestMethod.GET, params = {"search"})
    public List<Tag> searchTags(@RequestParam(value = "search") String search)
    {
        return tagService.searchTags(search);
    }
}
