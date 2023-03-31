import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-publicaciones_asociadas_a_un_hastag_item')
export class VistaPublicaciones_asociadas_a_un_hastag_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;">
 <img style="align-self: center; width: 70%;" src="../../resources/icons/video.png">
 <label style="align-self: center;">Usuario</label>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
