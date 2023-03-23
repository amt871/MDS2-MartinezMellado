import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera__administrador_';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-resultado_busqueda_hastag_item';

@customElement('vista-resultado_busqueda_hastag')
export class VistaResultado_busqueda_hastag extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera__administrador_ style="width: 100%; height: 5%;"></vista-cabecera__administrador_>
 <vaadin-horizontal-layout style="width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 60%; margin-top: var(--lumo-space-s); align-self: flex-start;">
   <label style="align-self: center;">Hashtags </label>
   <vaadin-scroller style="height: 100%; width: 100%;">
    <vista-resultado_busqueda_hastag_item style="margin-top: var(--lumo-space-s); margin-bottom: var(--lumo-space-s);"></vista-resultado_busqueda_hastag_item>
    <vista-resultado_busqueda_hastag_item style="margin-top: var(--lumo-space-s); margin-bottom: var(--lumo-space-s);"></vista-resultado_busqueda_hastag_item>
    <vista-resultado_busqueda_hastag_item style="margin-top: var(--lumo-space-s); margin-bottom: var(--lumo-space-s);"></vista-resultado_busqueda_hastag_item>
    <vista-resultado_busqueda_hastag_item style="margin-top: var(--lumo-space-s); margin-bottom: var(--lumo-space-s);"></vista-resultado_busqueda_hastag_item>
    <vista-resultado_busqueda_hastag_item style="margin-top: var(--lumo-space-s); margin-bottom: var(--lumo-space-s);"></vista-resultado_busqueda_hastag_item>
    <vista-resultado_busqueda_hastag_item style="margin-top: var(--lumo-space-s); margin-bottom: var(--lumo-space-s);"></vista-resultado_busqueda_hastag_item>
   </vaadin-scroller>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 40%; justify-content: center; align-items: center;">
   <vaadin-text-field style="width: 60%;"></vaadin-text-field>
   <vaadin-button style="width: 60%;">
    Buscar Usuario
   </vaadin-button>
   <vaadin-button style="width: 60%;">
    Buscar Hashtag
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
