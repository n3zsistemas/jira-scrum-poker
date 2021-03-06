package net.congstar.jira.plugins.scrumpoker.data;

/**
 * Component to save and load settings for the Scrum poker plugin.
 */
public interface ScrumPokerSettings {

    /**
     * Loads the currently saved story point field from the settings.
     *
     * @return story point field id
     */
    String loadStoryPointFieldId();

    /**
     * Persists the new story point field id or deletes it if empty or null.
     *
     * @param storyPointFieldId new story point field id
     */
    void persistStoryPointFieldId(String storyPointFieldId);

}
