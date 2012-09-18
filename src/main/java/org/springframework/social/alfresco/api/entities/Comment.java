
package org.springframework.social.alfresco.api.entities;


import java.util.Date;

import org.springframework.social.alfresco.api.entities.people.Person;


public class Comment
{
    private boolean    edited;
    private String     content;
    private String     id;
    private Date       modifiedAt;
    private Person     createdBy;
    private boolean    canDelete;
    private ModifiedBy modifiedBy;


    public boolean isEdited()
    {
        return edited;
    }


    public void setEdited(boolean edited)
    {
        this.edited = edited;
    }


    public String getContent()
    {
        return content;
    }


    public void setContent(String content)
    {
        this.content = content;
    }


    public String getId()
    {
        return id;
    }


    public void setId(String id)
    {
        this.id = id;
    }


    public Date getModifiedAt()
    {
        return modifiedAt;
    }


    public void setModifiedAt(Date modifiedAt)
    {
        this.modifiedAt = modifiedAt;
    }


    public Person getCreatedBy()
    {
        return createdBy;
    }


    public void setCreatedBy(Person createdBy)
    {
        this.createdBy = createdBy;
    }


    public boolean isCanDelete()
    {
        return canDelete;
    }


    public void setCanDelete(boolean canDelete)
    {
        this.canDelete = canDelete;
    }


    public ModifiedBy getModifiedBy()
    {
        return modifiedBy;
    }


    public void setModifiedBy(ModifiedBy modifiedBy)
    {
        this.modifiedBy = modifiedBy;
    }


}
