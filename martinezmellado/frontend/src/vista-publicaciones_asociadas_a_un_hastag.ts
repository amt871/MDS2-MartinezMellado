import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera__administrador_';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-publicaciones_asociadas_a_un_hastag_item';

@customElement('vista-publicaciones_asociadas_a_un_hastag')
export class VistaPublicaciones_asociadas_a_un_hastag extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" theme="spacing">
 <vista-cabecera__administrador_ style="width: 100%; height: 5%;"></vista-cabecera__administrador_>
 <label style="align-self: center;">Hashtag </label>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; align-items: center; justify-content: center; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m);">
  <vista-publicaciones_asociadas_a_un_hastag_item style="align-self: center;"></vista-publicaciones_asociadas_a_un_hastag_item>
  <vista-publicaciones_asociadas_a_un_hastag_item></vista-publicaciones_asociadas_a_un_hastag_item>
  <vista-publicaciones_asociadas_a_un_hastag_item></vista-publicaciones_asociadas_a_un_hastag_item>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m); align-self: center; align-items: center; justify-content: center;">
  <vista-publicaciones_asociadas_a_un_hastag_item></vista-publicaciones_asociadas_a_un_hastag_item>
  <vista-publicaciones_asociadas_a_un_hastag_item></vista-publicaciones_asociadas_a_un_hastag_item>
  <vista-publicaciones_asociadas_a_un_hastag_item></vista-publicaciones_asociadas_a_un_hastag_item>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
