import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-hashtag__usuario_registrado__item')
export class VistaHashtag__usuario_registrado__item extends LitElement {
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
<vaadin-horizontal-layout style="width: 100%; height: 5%; align-items: center; justify-content: center;">
 <vaadin-button style="width: 100%; flex-shrink: 0; flex-grow: 1; margin-left: var(--lumo-space-s);" id="bHashtag">
   Nombre Hashtag 
 </vaadin-button>
 <label style="flex-shrink: 0; flex-grow: 0; margin-right: var(--lumo-space-s);" id="labelVideos">Numero de videos </label>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
