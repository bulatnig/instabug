/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.instancio.Instancio;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class InstancioTest {
    @Test
    void zoneIdTest() {
        ZoneId zoneId = Instancio.create(ZoneId.class);
        assertNotNull(zoneId.getId());
        assertNotNull(zoneId.getRules());
    }
}
