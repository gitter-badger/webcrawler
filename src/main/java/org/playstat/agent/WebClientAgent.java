package org.playstat.agent;

import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;

import org.playstat.agent.nullagent.NullAgent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebClientAgent {
    private IAgent agent;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public WebClientAgent() {
        agent = new NullAgent();
    }

    public InputStream go(String url) throws IOException {
        return agent.go(new URL(url));
    }

    public IAgent getAgent() {
        return agent;
    }
}