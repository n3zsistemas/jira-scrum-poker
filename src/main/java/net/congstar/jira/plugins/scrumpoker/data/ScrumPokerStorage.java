package net.congstar.jira.plugins.scrumpoker.data;

import net.congstar.jira.plugins.scrumpoker.model.ScrumPokerSession;

import java.util.List;

public interface ScrumPokerStorage {

    /**
     * Return the Scrum poker session for the given issue.
     *
     * @param issueKey Key of the issue
     * @return Scrum poker session
     */
    ScrumPokerSession sessionForIssue(String issueKey);

    /**
     * List of Scrum poker sessions without confirmed estimation.
     *
     * @return list of Scrum poker sessions
     */
    List<ScrumPokerSession> getOpenSessions();

    /**
     * List of Scrum poker sessions with confirmed estimation.
     *
     * @return list of Scrum poker sessions
     */
    List<ScrumPokerSession> getClosedSessions();

}
