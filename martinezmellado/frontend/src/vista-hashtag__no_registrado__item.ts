import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-hashtag__no_registrado__item')
export class VistaHashtag__no_registrado__item extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: space-between; padding: var(--lumo-space-m);">
 <vaadin-button style="width: 100%;">
  Nombre Hashtag
 </vaadin-button>
 <label style="flex-shrink: 0; flex-grow: 0; margin-right: var(--lumo-space-s); align-self: center;">Numero de videos</label>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
